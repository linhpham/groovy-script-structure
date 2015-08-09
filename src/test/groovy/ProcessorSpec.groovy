import spock.lang.*

class ProcessSpec extends Specification {
    def "#first test"() {
        when:
        def a = true

        then:
        a == false
    }
}