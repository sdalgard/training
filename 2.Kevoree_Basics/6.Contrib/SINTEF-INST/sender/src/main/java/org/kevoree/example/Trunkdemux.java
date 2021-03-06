package org.kevoree.example;

import org.kevoree.annotation.*;
import org.kevoree.api.Port;
import org.kevoree.log.Log;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ComponentType
public class Trunkdemux {

    @Output
    private Port out1;

    @Output
    private Port out2;

    @Output
    private Port out3;

    @Input
    public void muxin(Object msg){
	String str= new String(""+msg);
	Log.info("Trunkdemux::muxin got <" + str + ">");
	if(str.charAt(0) == '#') {
	    char addr= str.charAt(1);
	    switch (addr) {
		case '1':
		    out1.send(str.substring(2), null);
		    break;
		case '2':
		    out2.send(str.substring(2), null);
		    break;
		case '3':
		    out3.send(str.substring(2), null);
		    break;
		default:
	    	    Log.info("Trunkdemux::muxin ERROR address=" + addr + " is of range");
		    break;
	    }
	} else {
	    Log.info("Trunkdemux::muxin ERROR does not start with #");
	}
    }

    @Start
    public void start() {
	Log.info("Trunkdemux started");
    }

    @Stop
    public void stop() {
	Log.info("Trunkdemux end");
    }

}
