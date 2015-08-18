
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    kernel-modules \
    nginx \
    nfs-utils-client \
    i2c-tools \
    "
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    "
