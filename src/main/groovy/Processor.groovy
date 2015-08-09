import groovy.sql.Sql
import org.apache.log4j.*
import groovy.util.logging.*

@Log4j
class Processor {
    def opts
    
    Processor(opts) {
        log.level = Level.DEBUG
        this.opts = opts
    }

    void run() {
        log.info "Running..."
    }
}