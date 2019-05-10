package pdi


import grails.rest.*
import grails.converters.*

class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserController() {
        super(User)
    }

    def login(){
        render (params.user + ' & ' + params.pwd)
    }
}
