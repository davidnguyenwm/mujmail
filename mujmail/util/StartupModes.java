/*
MujMail - Simple mail client for J2ME
Copyright (C) 2008 David Hauzar <david.hauzar.mujmail@gmail.com>

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package mujmail.util;

/**
 * Enumeration class representing startup modes.
 * 
 * @author David Hauzar
 */
public class StartupModes {
    private StartupModes() {};

    /** Task will be started in new thread */
    public static final StartupModes IN_NEW_THREAD = new StartupModes();
    /** Task will not be started in new thread */
    public static final StartupModes IN_THE_SAME_THREAD = new StartupModes();
}


