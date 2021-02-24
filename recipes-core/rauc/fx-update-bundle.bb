inherit bundle

RAUC_BUNDLE_COMPATIBLE = "${MACHINE}"
RAUC_BUNDLE_SLOTS = "rootfs"
RAUC_BUNDLE_FORMAT = "verity"
RAUC_SLOT_rootfs = "image-fx"

RAUC_KEY_FILE = "${COREBASE}/layers/meta-fx/files/development-1.key.pem"
RAUC_CERT_FILE = "${COREBASE}/layers/meta-fx/files/development-1.cert.pem"