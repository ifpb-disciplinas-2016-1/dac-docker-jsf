FROM payara-micro
ADD target/dac-exemplo.war ${DEPLOYMENT_DIR}
