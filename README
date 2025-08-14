Allows interacting with OpenAI Model (gpt-4o) for inferencing/prompting using Spring Boot 3.X with Langchain4j framework
Function-call/tool was used to provide LLM access to latest stock information from external source. 

Pre-Req: 
Java 17 with Spring Boot 3.X and Langchain4j framework
Free API key from https://financialmodelingprep.com (for latest stock information-just register in that site)

Steps:
1. Downlaod project from repo.
2. Add OpenAI API key in application.properties (langchain4j.open-ai.chat-model.api-key). Better to use environment variable and read the value from there.
Note: You can get api key from OpenAI web site. 
3. Run Spring Boot application PromptdemoApplication.java from IDE or terminal.
4. Access endpoint from postman or browser: http://localhost:8080/chat?userMessage=What are u



User: http://localhost:8080/chat?userMessage=What is today's price for AAPL

Agent: As of today, the stock price for Apple Inc. (AAPL) is $232.78. The stock has decreased by $0.55, representing a change of -0.24%.

This response is based on latest stock information coming from the external API site. LLM does not know this information as the model is little bit outdated in terms of it's training data. hence function call was utilized to extend the knowledgebase of the model via tooling.
Since we are logging request and response to/from the model, terminal output confirms that right tooling was invoked to get access to latest stock information (Look for getStockDetails):


 {
    "role" : "tool",
    "tool_call_id" : "call_j2b9hHGDIMLBWtREAlnzUqvF",
    "content" : "[{\"symbol\":\"AAPL\",\"name\":\"AppleInc.\",\"price\":232.78,\"changePercentage\":-0.23572,\"change\":-0.55,\"volume\":49379782,\"dayLow\":230.85,\"dayHigh\":235.11,\"yearHigh\":260.1,\"yearLow\":169.21,\"marketCap\":3454548282204,\"priceAvg50\":208.4212,\"priceAvg200\":221.0391,\"exchange\":\"NASDAQ\",\"open\":234.055,\"previousClose\":233.33,\"timestamp\":1755201601}]"
  } ],
  "stream" : false,
  "tools" : [ {
    "type" : "function",
    "function" : {
      "name" : "getStockDetails",
      "description" : "Returns stock price and details for a given stock symbol",
      "parameters" : {
        "type" : "object",
        "properties" : {
          "symbol" : {
            "type" : "string",
            "description" : "stock symbol"
          }
        },
        "required" : [ "symbol" ]
      }
    }
