
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    nfs-utils-client \
    "
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    "
