meta-oneir
==========

Yocto layer to create oneir project images

Dependencies
------------

This layer depends on the following layers:
meta-openembedded
meta-raspberrypi

Build instructions
------------------

git clone git://git.yoctoproject.org/poky.git
cd poky
git checkout fido

git clone git://git.yoctoproject.org/git/meta-raspberrypi
cd meta-raspberry
git checkout fido
cd ..

git clone git://git.openembedded.org/meta-openembedded
cd meta-openembedded
git checkout fido
cd ..

git checkout https://github.com/fvanderwerf/meta-oneir.git

source oe-init-build-env build-rpi

edit conf/local.conf to set MACHINE variable to raspberrypi

run bitbake oneir to build an image
