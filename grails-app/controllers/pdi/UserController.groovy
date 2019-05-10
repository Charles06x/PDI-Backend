package pdi


import grails.rest.*
import grails.converters.*

import grails.plugins.rest.client.RestBuilder
import grails.plugins.rest.client.RestResponse

class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserController() {
        super(User)
    }

    def login(){

        RestBuilder req = new RestBuilder()
        RestResponse res = req.get("http://savio.utbvirtual.edu.co/login/token.php?username="+params.user+"&password="+params.pwd+"&service=moodle_mobile_app")
        if(res.statusCode.value == 200 && res.json.token) {
            def query = User.where { 
                code ==~ "%${params.user}%"           
            }
            respond query
        }
        render "Not working xD Dx"
        //"http://savio.utbvirtual.edu.co/login/token.php?username="+params.user+"&password="+params.pwd+"&service=moodle_mobile_app"
    }
}
