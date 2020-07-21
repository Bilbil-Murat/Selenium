package driver_manager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AutomationContext {

 public AutomationContext(ScenarioMgr scenarioMgr)throws IOException{
     this.scenarioMgr=scenarioMgr;
     proportiesReader = new ProportiesReader();
 }

    public ScenarioMgr getScenarioMgr() {
        return scenarioMgr;
    }

    ScenarioMgr scenarioMgr;
    ProportiesReader proportiesReader;

    public ProportiesReader getProportiesReader(){
        return proportiesReader;
    }

    private Map<String, String> contextMap = new HashMap<>();

    public String getContextMap(String key)  {
        return contextMap.get(key);
    }

    public void setContextMap(String key, String value) {
        contextMap.put(key, value);
    }

}

