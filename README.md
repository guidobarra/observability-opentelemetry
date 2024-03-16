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
