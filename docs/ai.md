# AiManager


- [Ask question](#ask-question)
- [Generate text](#generate-text)
- [Get AI agent default configuration](#get-ai-agent-default-configuration)
- [Extract metadata (freeform)](#extract-metadata-freeform)
- [Extract metadata (structured)](#extract-metadata-structured)

## Ask question

Sends an AI request to supported LLMs and returns an answer specifically focused on the user's question given the provided context.

This operation is performed by calling function `createAiAsk`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/post-ai-ask/).

<!-- sample post_ai_ask -->
```
client.getAi().createAiAsk(new AiAsk(AiAskModeField.MULTIPLE_ITEM_QA, "Which direction sun rises?", Arrays.asList(new AiItemBase.AiItemBaseBuilder(fileToAsk1.getId()).type(AiItemBaseTypeField.FILE).content("Earth goes around the sun").build(), new AiItemBase.AiItemBaseBuilder(fileToAsk2.getId()).type(AiItemBaseTypeField.FILE).content("Sun rises in the East in the morning").build())))
```

### Arguments

- requestBody `AiAsk`
  - Request body of createAiAsk method
- headers `CreateAiAskHeaders`
  - Headers of createAiAsk method


### Returns

This function returns a value of type `AiResponseFull`.

A successful response including the answer from the LLM.


## Generate text

Sends an AI request to supported Large Language Models (LLMs) and returns generated text based on the provided prompt.

This operation is performed by calling function `createAiTextGen`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/post-ai-text-gen/).

<!-- sample post_ai_text_gen -->
```
client.getAi().createAiTextGen(new AiTextGen.AiTextGenBuilder("Parapharse the document.s", Arrays.asList(new AiTextGenItemsField.AiTextGenItemsFieldBuilder(fileToAsk.getId()).type(AiTextGenItemsTypeField.FILE).content("The Earth goes around the sun. Sun rises in the East in the morning.").build())).dialogueHistory(Arrays.asList(new AiDialogueHistory.AiDialogueHistoryBuilder().prompt("What does the earth go around?").answer("The sun").createdAt("2021-01-01T00:00:00Z").build(), new AiDialogueHistory.AiDialogueHistoryBuilder().prompt("On Earth, where does the sun rise?").answer("East").createdAt("2021-01-01T00:00:00Z").build())).build())
```

### Arguments

- requestBody `AiTextGen`
  - Request body of createAiTextGen method
- headers `CreateAiTextGenHeaders`
  - Headers of createAiTextGen method


### Returns

This function returns a value of type `AiResponse`.

A successful response including the answer from the LLM.


## Get AI agent default configuration

Get the AI agent default config

This operation is performed by calling function `getAiAgentDefaultConfig`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/get-ai-agent-default/).

<!-- sample get_ai_agent_default -->
```
client.getAi().getAiAgentDefaultConfig(new GetAiAgentDefaultConfigQueryParams.GetAiAgentDefaultConfigQueryParamsBuilder(GetAiAgentDefaultConfigQueryParamsModeField.TEXT_GEN).language("en-US").build())
```

### Arguments

- queryParams `GetAiAgentDefaultConfigQueryParams`
  - Query parameters of getAiAgentDefaultConfig method
- headers `GetAiAgentDefaultConfigHeaders`
  - Headers of getAiAgentDefaultConfig method


### Returns

This function returns a value of type `AiAgentAskOrAiAgentExtractOrAiAgentExtractStructuredOrAiAgentTextGen`.

A successful response including the default agent configuration.
This response can be one of the following four objects:
* AI agent for questions
* AI agent for text generation
* AI agent for freeform metadata extraction
* AI agent for structured metadata extraction.
The response depends on the agent configuration requested in this endpoint.


## Extract metadata (freeform)

Sends an AI request to supported Large Language Models (LLMs) and extracts metadata in form of key-value pairs.
In this request, both the prompt and the output can be freeform.
Metadata template setup before sending the request is not required.

This operation is performed by calling function `createAiExtract`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/post-ai-extract/).

<!-- sample post_ai_extract -->
```
client.getAi().createAiExtract(new AiExtract("firstName, lastName, location, yearOfBirth, company", Arrays.asList(new AiItemBase(file.getId()))))
```

### Arguments

- requestBody `AiExtract`
  - Request body of createAiExtract method
- headers `CreateAiExtractHeaders`
  - Headers of createAiExtract method


### Returns

This function returns a value of type `AiResponse`.

A response including the answer from the LLM.


## Extract metadata (structured)

Sends an AI request to supported Large Language Models (LLMs) and returns extracted metadata as a set of key-value pairs.
For this request, you either need a metadata template or a list of fields you want to extract.
Input is **either** a metadata template or a list of fields to ensure the structure.
To learn more about creating templates, see [Creating metadata templates in the Admin Console](https://support.box.com/hc/en-us/articles/360044194033-Customizing-Metadata-Templates)
or use the [metadata template API](g://metadata/templates/create).

This operation is performed by calling function `createAiExtractStructured`.

See the endpoint docs at
[API Reference](https://developer.box.com/reference/post-ai-extract-structured/).

<!-- sample post_ai_extract_structured -->
```
client.getAi().createAiExtractStructured(new AiExtractStructured.AiExtractStructuredBuilder(Arrays.asList(new AiItemBase(file.getId()))).metadataTemplate(new AiExtractStructuredMetadataTemplateField.AiExtractStructuredMetadataTemplateFieldBuilder().templateKey(templateKey).scope("enterprise").build()).build())
```

### Arguments

- requestBody `AiExtractStructured`
  - Request body of createAiExtractStructured method
- headers `CreateAiExtractStructuredHeaders`
  - Headers of createAiExtractStructured method


### Returns

This function returns a value of type `AiExtractResponse`.

A successful response including the answer from the LLM.


