SUMMARY = "SWupdate"
DESCRIPTION = "SWupdate conf recipe"
LICENSE = "CLOSED"

IMAGE_DEPENDS = "image-fx"

SWUPDATE_IMAGES = "image-fx"
SWUPDATE_IMAGES_FSTYPES[image-fx] = ".ext4.gz"

SRC_URI = " \
    file://emmcsetup.lua \
    file://sw-description \
    "

inherit swupdate