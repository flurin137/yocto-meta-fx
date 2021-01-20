SUMMARY = "The Qt5 Yocto image based on the rpi-basic-image"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES_append = " x11 splash"
