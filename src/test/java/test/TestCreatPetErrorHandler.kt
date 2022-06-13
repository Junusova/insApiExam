package test

import controller.createPetExecutePostApiMethod
import helpers.CreatePet
import net.javacrumbs.jsonunit.JsonMatchers
import net.javacrumbs.jsonunit.core.util.ResourceUtils
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Add pet negative cases")
class TestCreatPetErrorHandler {

    @Test
    fun test01_AddPet_IncorrectIdType_400BadRequest(){
        val requestBody = CreatePet().pet
        createPetExecutePostApiMethod(
                requestPayload = requestBody.replace("12", "test"),
        )

                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("type", equalTo("unknown"),
                        "message", equalTo("bad input" ))
    }

    @Test
    fun test02_AddPet_IncorrectIdType_400BadRequest(){
        val requestBody = CreatePet().pet
        createPetExecutePostApiMethod(
                requestPayload = requestBody.replace("testUrl", ""),
        )

                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .body("type", equalTo("unknown"),
                        "message", equalTo("bad input" ))
    }
}