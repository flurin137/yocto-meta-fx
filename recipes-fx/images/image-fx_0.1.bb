SUMMARY = "The Qt5 Yocto image based on the core-image-minimal"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES_append = " splash ssh-server-dropbear"
IMAGE_INSTALL_append = " rauc libubootenv-bin"
IMAGE_FSTYPES_append = " wic ext4.gz"