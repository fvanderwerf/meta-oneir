
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    nfs-utils-client \
    oneir-control \
    kernel-modules \
    "
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    "
