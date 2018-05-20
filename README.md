
**慕课网 《Java大牛 带你从0到上线开发企业级电商项目》 学习**

功能如下： 
   
    1.用户模块
        登录
            login.do
            根据用户名和密码登录，如果登陆成功，存入Session，失败返回登录界面，返回错误信息
        用户名验证
            int checkUsername(String username);
            验证用户名是否存在，
            登录情况下，用户名存在，进行登录
            注册情况下，用户名存在，注册失败
        注册
            register.do
            设置角色，密码MD5加密
        忘记密码
            forget_get_question.do
            通过用户名获得注册问题
        提交问题答案
            forget_check_answer.do
            通过问题和答案同时需要用户名防止越权漏洞
        重置密码
            forget_reset_password.do
        登录情况下重置密码
            reset_password.do
        获取用户信息
            get_information.do
        更新用户信息
            update_information.do
        退出登录
            logout.do
            从session中删除登录存入的用户，返回登录界面
            
            
    2.分类管理模块
        增加节点
            add_category.do
            通过节点名称和父节点ID来增加节点
        修改名字
            set_category_name.do"
            通过节点ID来修改节点名称
        获取分类ID
            get_category.do
        递归子节点ID
            get_deep_category.do
            两者均调用selectCategoryChildrenByParentId(Integer parentId)方法，只是在查询后递归调用
          
          
    3.商品管理模块
        