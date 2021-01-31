export LD_LIBRARY_PATH = /svc/lib/

java -Djava.library.path=/svc/lib $JAVA_OPTS -jar /svc/jar/retailservice-0.0.1.jar com.target.product.retailservice.RetailServiceApplication