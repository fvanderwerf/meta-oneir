
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    kernel-modules \
    nginx \
    nfs-utils-client \
    "
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    "
