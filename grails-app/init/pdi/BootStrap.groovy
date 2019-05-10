package pdi

class BootStrap {

    def init = { servletContext ->
        def u = new User(code: 't00039395', name: 'charles').save()
    }
    def destroy = {
    }
}
