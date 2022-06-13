package test

import controller.createPetExecutePostApiMethod
import helpers.CreatePet
import net.javacrumbs.jsonunit.JsonMatchers.jsonEquals
import net.javacrumbs.jsonunit.core.util.ResourceUtils.resource
import org.apache.http.HttpStatus
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Add pet positive case")
class TestCreatPet {

    @Test
    fun test01_AddPet_200OK(){
        val requestBody = CreatePet().pet
       val responseBody =  createPetExecutePostApiMethod(
                requestPayload = requestBody
        )

                .statusCode(HttpStatus.SC_OK)
               .log().body(true)
                .extract()
                .response()
                .asString()
        assertThat(responseBody, jsonEquals(resource("CreatePetResponseBody.json")))
    }
}