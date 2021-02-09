SUMMARY = "The Qt5 Yocto image based on the core-image-minimal"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES_append = " splash ssh-server-dropbear"

IMAGE_INSTALL += "swupdate"
IMAGE_FSTYPES += "wic ext4.gz"