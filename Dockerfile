FROM openjdk:8-openjdk
ENV SVC_ROOT /svc
RUN mkdir -p $SVC_ROOT/jar/; mkdir -p $SVC_ROOT/lib/ ; mkdir -p $SVC_ROOT/resources/;

ADD target/retailservice-0.0.1.jar $SVC_ROOT/jar/
ADD target/classes/* $SVC_ROOT/classes/

ADD run_mock.sh $SVC_ROOT/resources/run_mock.sh

RUN chmod 777 $SVC_ROOT/resources/run_mock.sh
ENV LD_LIBRARY_PATH $SVC_ROOT/lib

WORKDIR $SVC_ROOT/resources

ENTRYPOINT ["sh","-c""/svc/resources/run_mock.sh"]