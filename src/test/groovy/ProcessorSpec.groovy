import spock.lang.*

class ProcessSpec extends Specification {
    def "#new set host to parameter, or default to localhost"() {
        expect:
        new Processor([]).host == 'localhost'
        new Processor([h: 'myserver']).host == 'myserver'
    }
}