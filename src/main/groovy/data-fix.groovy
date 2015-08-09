#!/usr/bin/env groovy

@GrabConfig(systemClassLoader=true)
@Grab('mysql:mysql-connector-java:5.1.27')
@Grab('log4j:log4j:1.2.17')

def cli = new CliBuilder(usage:'data-fix')
cli.with {
    u longOpt: 'user', args: 1, argName: 'user', required: true, 'DB user'
    p longOpt: 'password', args: 1, argName: 'password', required: true, 'DB password'
    s longOpt: 'sourceSchema', args: 1, argName: 'sourceDbSchema', required: true, 'staging DB schema'
    d longOpt: 'destinationSchema', args: 1, argName: 'destDbSchema', required: true, 'production DB schema'
    h longOpt: 'host', args: 1, argName: 'dbHost', 'DB host, default to be localhost'
}

def opts = cli.parse(args)
if (!opts) {
    System.exit(1)
}

new Processor(opts).run()
