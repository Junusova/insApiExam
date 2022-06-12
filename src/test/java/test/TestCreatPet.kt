package test

import controller.createPetExecutePostApiMethod
import helpers.CreatePet
import org.apache.http.HttpStatus
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Add pet positive cases")
class TestCreatPet {

    @Test
    fun test01_AddPet_200OK(){
        val requestBody = CreatePet().pet
        createPetExecutePostApiMethod(
                requestPayload = requestBody
        )
                .statusCode(HttpStatus.SC_OK)
                .log().body(true)
    }
}