package test

import controller.updatePetExecutePutApiMethod
import helpers.CreatePet
import org.apache.http.HttpStatus
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Update pet positive case")
class TestUpdatePet {

    @Test
    fun test01_UpdatePetCategoryName_200OK() {
        val requestBody = CreatePet().pet
        updatePetExecutePutApiMethod(
                requestPayload = requestBody.replace("Sirius","Garfield")
        )

                .statusCode(HttpStatus.SC_OK)
                .body("category.name", equalTo("Garfield"))
    }
}