<template>

    <div>
        <p>
            <button v-on:click="add()" class="btn btn-white btn-default btn-round">
                <i class="ace-icon fa fa-edit"></i>
                新增
            </button>
            &nbsp;
            <button v-on:click="list(1)" class="btn btn-white btn-default btn-round">
                <i class="ace-icon fa fa-refresh"></i>
                刷新
            </button>
        </p>

        <pagination ref="pagination" v-bind:list="list" v-bind:itemCount="8"></pagination>

        <table id="simple-table" class="table  table-bordered table-hover">
            <thead>
            <tr>
                <th>ID</th>
                <th>名称</th>
                <th>课程ID</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <tr v-for="cha in chapters">
                <td>{{cha.id}}</td>
                <td>{{cha.name}}</td>
                <td>{{cha.courseId}}</td>
                <td>
                    <div class="hidden-sm hidden-xs btn-group">
                        <button @click="edit(cha)" class="btn btn-xs btn-info">
                            <i class="ace-icon fa fa-pencil bigger-120"></i>
                        </button>

                        <button  @click="del(cha.id)" class="btn btn-xs btn-danger">
                            <i class="ace-icon fa fa-trash-o bigger-120"></i>
                        </button>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>

        <div id="form-modal" class="modal fade" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title">表单</h4>
                    </div>
                    <div class="modal-body">
                        <form class="form-horizontal">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">名称</label>
                                <div class="col-sm-10">
                                    <input v-model="chapter.name"  class="form-control" placeholder="名称">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-sm-2 control-label">课程ID</label>
                                <div class="col-sm-10">
                                    <input v-model="chapter.courseId"  class="form-control" placeholder="课程ID">
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button v-on:click="save()" type="button" class="btn btn-primary">保存</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
    </div>

</template>

<script>
    import Pagination from "../../components/pagination";
    export default {
        components: {Pagination},
        name: "chapter",
        data:function(){
            return{
                //映射表单数据
                chapter:{},
                chapters:[],
            }
        },
        mounted:function () {
            let _this=this;
            _this.$refs.pagination.size=5;
            _this.list(1);
        },
        methods:{
            /**
             * 点击【新增】
             */
            add(){
                let _this= this;
                _this.chapter={};
                $("#form-modal").modal("show");
            },

            /**
             * 修改
             * */
            edit(chapter){
                let _this= this;
                _this.chapter=$.extend({},chapter);
                $("#form-modal").modal("show");
            },

            /**
             * 列表查询
             */
            list(page){
                alert("hello")
                let _this =this;
                _this.$ajax.post(
                    "http://127.0.0.1:9000/business/admin/chapter/list",
                    {
                        page:page,
                        size:_this.$refs.pagination.size
                    }).then(resp=>{
                    console.log("查询大章的结果:"+resp);
               /*     let resp=response.data;
                    _this.chapters = resp.content.list;
                    _this.$refs.pagination.render(page, resp.content.total);*/
                })
            },

            /**
             * 保存
             */
            save(page){
                let _this =this;
                Loading.show();
                _this.$ajax.post(
                    "http://127.0.0.1:9000/business/admin/chapter/save", _this.chapter).then((response)=>{
                    console.log("查询大章的结果",response);
                    let resp=response.data;
                    Loading.hide();
                    //请求返回的结果处理
                    if (resp.success){
                        $("#form-modal").modal("hide");
                        _this.list(1);
                        Toast.success("保存成功");
                    }else {
                        Toast.warning(resp.message)
                    }
                })
            },

            /**
             * 删除
             */
            del(id){
                let _this =this;
                Confirm.show("删除后不可以恢复,确认删除？" ,function () {
                    Loading.show();
                    _this.$ajax.delete(
                        "http://127.0.0.1:9000/business/admin/chapter/delete/"+ id).then((response)=>{
                        let resp=response.data;
                        Loading.hide();
                        if (resp.success){
                            _this.list(1);
                            Toast.success("删除成功");
                        }
                    })
                })
            },
        }
    }
</script>
