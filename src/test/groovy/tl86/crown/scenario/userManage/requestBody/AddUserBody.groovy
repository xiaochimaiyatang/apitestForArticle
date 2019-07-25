package tl86.crown.scenario.userManage.requestBody

class AddUserBody {
    def userInfo=[:]
    def roleIdList=[]
    UserManageTemplate userManageTemplate
    AddUserBody() {
        userManageTemplate = new UserManageTemplate()
    }
    def setUserLoginName(loginName) {
        this.userInfo.loginName=loginName
        this
    }

    def setUserNickName(nickName){
        this.userInfo.nickName=nickName
        this
    }

    def setUerPhone(phone){
        this.userInfo.phone=phone
        this
    }

    def setUserEmail(email) {
        this.userInfo.email=email
        this
    }

    def setRoleIdList(roleIdList) {
        this.roleIdList = roleIdList
        this
    }

    def setUserIdForEditUser(id)
    {   this.userInfo.isEditUser=true
        this.userInfo.id=id
        this
    }

    def getAddUserBody() {
        userManageTemplate.getAddUserRequestBody(this)
    }

}
