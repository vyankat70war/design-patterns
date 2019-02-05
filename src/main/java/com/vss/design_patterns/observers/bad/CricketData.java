package com.vss.design_patterns.observers.bad;

public class CricketData {
	
	private CurrentScoreDisplay currentScoreDisplay;
	private AverageScoreDisplay averageScoreDisplay;
	int runs, wickets;
	float overs;
	// Constructor 
    public CricketData(CurrentScoreDisplay currentScoreDisplay, 
                       AverageScoreDisplay averageScoreDisplay) 
    { 
        this.currentScoreDisplay = currentScoreDisplay; 
        this.averageScoreDisplay = averageScoreDisplay; 
    } 
  
    // Get latest runs from stadium 
    private int getLatestRuns() 
    { 
        // return 90 for simplicity 
        return 90; 
    } 
  
    // Get latest wickets from stadium 
    private int getLatestWickets() 
    { 
        // return 2 for simplicity 
        return 2; 
    } 
  
    // Get latest overs from stadium 
    private float getLatestOvers() 
    { 
        // return 10.2 for simplicity 
        return (float)10.2; 
    } 
    
    public void dataChanged() 
    { 
        // get latest data 
        runs = getLatestRuns(); 
        wickets = getLatestWickets(); 
        overs = getLatestOvers(); 
  
        currentScoreDisplay.update(runs,wickets,overs); 
        averageScoreDisplay.update(runs,wickets,overs); 
    } 

}
