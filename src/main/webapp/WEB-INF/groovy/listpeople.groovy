/**
 * Created by kevintanhongann on 7/10/15.
 */
import com.google.gson.*
import com.example.domain.Person

log.info "list people"
response.contentType = 'application/json'

def people = Person.findAll()

//response.renderJson(people)
json(people : people)




