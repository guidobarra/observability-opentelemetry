# observability-opentelemetry
observability with opentelemetry for app java

## Build

* create image docker, only app java

    ```
    make docker_build
    ```

## Run

    ```
    make docker_deploy
    ```

## Log

    ```
    make docker_log LOG_TAIL_N=1
    ```

## Stop

    ```
    make docker_stop
    ```

## swagger

[link](http://localhost:9292/client/swagger-ui/index.html)

## jaeger

[link](http://localhost:16686/search)

## zipkin

[link](http://localhost:9411/zipkin/)


## prometheus

[link](http://localhost:9090/targets?search=)

## grafana

[link](http://localhost:3000/)

## loki

``{job="client-service"} | json | line_format "{{.body}}"``
