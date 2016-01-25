
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    nfs-utils-client \
    oneir-control \
    "
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    "
