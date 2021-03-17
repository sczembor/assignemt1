cmake_minimum_required (VERSION 2.8.11)
project(sockets)

INCLUDE_DIRECTORIES("include")

add_executable(test apps/test.c src/lines.c)
add_executable(client apps/client.c src/lines.c)
add_executable(server apps/server.c src/lines.c)

find_package (Threads)
target_link_libraries (server ${CMAKE_THREAD_LIBS_INIT})

find_package(Java REQUIRED)
include(UseJava)


add_jar(jclient apps/client.java MANIFEST manifest.mf)
