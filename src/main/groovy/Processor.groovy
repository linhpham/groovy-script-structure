import groovy.sql.Sql
import org.apache.log4j.*
import groovy.util.logging.*

@Log4j
class Processor {
    def opts

    def host

    Processor(opts) {
        log.level = Level.DEBUG
        this.opts = opts
        this.host = opts.h ?: 'localhost'
    }

    void run() {
        log.info "Host               : $host"
        log.info "User               : ${opts.u}"
        log.info "Password           : ${opts.p}"
        log.info "Source schema      : ${opts.s}"
        log.info "Destination schema : ${opts.d}"

    }
}