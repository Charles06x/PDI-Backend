package pdi

class BootStrap {

    def init = { servletContext ->
        def u = new User(code: 't00039395', rol: 1, name: 'charles').save(flush: true)
        def v = new User(code: 't00040808', rol: 1, name: 'pablo').save(flush: true)
    }
    def destroy = {
    }
}
