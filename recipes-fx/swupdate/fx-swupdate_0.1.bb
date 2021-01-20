SUMMARY = "SWupdate"
DESCRIPTION = "SWupdate conf recipe"
LICENSE = "CLOSED"

IMAGE_DEPENDS = "image-fx"

SWUPDATE_IMAGES = "image-fx"

SRC_URI = " \
    file://sw-description \
    "

inherit swupdate