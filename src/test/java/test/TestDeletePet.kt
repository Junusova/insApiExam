package test

import controller.createPetExecutePostApiMethod
import controller.deletePetExecuteDeleteApiMethod
import helpers.CreatePet
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


@DisplayName("Delete pet positive case")
class TestDeletePet {

    @BeforeEach
    fun init(){
        val requestBody = CreatePet().pet
        createPetExecutePostApiMethod(
                requestPayload = requestBody
        )

                .statusCode(HttpStatus.SC_OK)
    }

    @Test
    fun test01_DeletePet_200OK(){
        deletePetExecuteDeleteApiMethod(
                petId = 12
        )
                .statusCode(HttpStatus.SC_OK)
                .body("message",equalTo("12"),
                "type", equalTo("unknown"))
    }


}