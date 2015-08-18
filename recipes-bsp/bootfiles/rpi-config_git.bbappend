
do_deploy_append() {
    echo "dtparam=i2c_arm=on" >> ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}
