
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    nfs-utils-client \
    rabbitmq-c \
    "
IMAGE_FEATURES += " \
    ssh-server-dropbear \
    "
