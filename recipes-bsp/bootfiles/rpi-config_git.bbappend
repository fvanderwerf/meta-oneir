
do_deploy_append() {
    echo "dtparam=i2c_arm=on,spi=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
