
Date: 14 Dec2022
Name: Brock Bye
Course number: CSCI-1913
Term: Fall 2022
Lab/assignment number: Final Project


This program runs on two PIC24FJ64GA002 microcontrollers, and requires minimal manipulation in the code to get working; more specificially, it requires a #define MASTER
    to control the left PIC (ie, left legs), and if MASTER is not defined, it runs as a SLAVE, and controls the right legs instead.
    
This file is operational when compiled using MPLAB X IDE Version 5.50. It uses a XC16 V02 compliler. 

Files required for operation:
~ Project_Aragog_main.c
~ Project_Aragog_master.c
~ Project_Aragog_master.h
~ Project_Aragog_master_defines.h
~ Project_Aragog_slave.c
~ Project_Aragog_slave.h
~ Project_Aragog_slave_defines.h
~ Project_Aragog_general_setup.c
~ Project_Aragog_general_setup.h
