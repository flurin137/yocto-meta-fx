SUMMARY = "SWupdate"
DESCRIPTION = "SWupdate conf recipe"

LICENSE = "CLOSED"

inherit swupdate

SWUPDATE_IMAGES = "image-fx"

SRC_URI = " \
    file://sw-description \
    "
    