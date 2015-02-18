/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.kevoree;
import org.thingml.generated.*;
import org.kevoree.annotation.*;
import org.kevoree.log.Log;
import org.thingml.generated.api.*;
import org.thingml.java.*;
import org.thingml.java.ext.*;
import org.thingml.generated.messages.*;

import com.eclipsesource.json.JsonObject;



@ComponentType
 public class KDeployment0{//The Kevoree component wraps the whole ThingML configuration Deployment0
//Things
private TimerJava TimerJava_Deployment0_timer;
//Output ports (dangling ports in the ThingML configuration)
@Output
private org.kevoree.api.Port Deployment0_timer_timerPort_out;
@Input
public void Deployment0_timer_timerPort(String string) {
final JsonObject json = JsonObject.readFrom(string);
if (json.get("port").asString().equals("timer_c")) {
if (json.get("message").asString().equals("timer_start")) {
final Event msg = TimerJava_Deployment0_timer.getTimer_startType().instantiate(TimerJava_Deployment0_timer.getTimer_port(), (short) json.get("delay").asInt());
TimerJava_Deployment0_timer.receive(msg, TimerJava_Deployment0_timer.getTimer_port());
}
else if (json.get("message").asString().equals("timer_cancel")) {
final Event msg = TimerJava_Deployment0_timer.getTimer_cancelType().instantiate(TimerJava_Deployment0_timer.getTimer_port());
TimerJava_Deployment0_timer.receive(msg, TimerJava_Deployment0_timer.getTimer_port());
}
}
}

//Attributes
//Getters and Setters for non readonly/final attributes
//Empty Constructor
public KDeployment0() {
initThingML();
}

//Instantiates ThingML component instances and connectors
private void initThingML() {
//Things
TimerJava_Deployment0_timer = (TimerJava) new TimerJava("Deployment0_timer: TimerJava", (Thread)null).buildBehavior();
//Connectors
final ITimerJava_timerClient Deployment0_timer_timer_listener = new ITimerJava_timerClient(){
@Override
public void timer_timeout_from_timer() {
final String msg = "{\"message\":\"timer_timeout\",\"port\":\"timer_c\"}";
try {
Deployment0_timer_timerPort_out.send(msg, null);
} catch(NullPointerException npe) {
Log.warn("Port Deployment0_timer_timerPort_out is not connected.\nMessage " + msg + " has been lost.\nConnect a channel (and maybe restart your component Deployment0)");
}
}
};
TimerJava_Deployment0_timer.registerOnTimer(Deployment0_timer_timer_listener);
}

@Start
public void startComponent() {
TimerJava_Deployment0_timer.init();
TimerJava_Deployment0_timer.start();
}

@Stop
public void stopComponent() {TimerJava_Deployment0_timer.stop();
}

}
