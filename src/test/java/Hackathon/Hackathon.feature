Feature: List of Hackathons
  Background: 
    * url "http://localhost:8080/mavenp1/"
    
    Scenario: list of hackathons
      Given path "hackathonsDTO/"
      When method GET
      Then status 200