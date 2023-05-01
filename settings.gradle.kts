
rootProject.name = "foodOrderSystem"
include("orderService")
include("orderService:orderDomain")
findProject(":orderService:orderDomain")?.name = "orderDomain"
include("orderService:orderApplication")
findProject(":orderService:orderApplication")?.name = "orderApplication"
include("orderService:orderDataAccess")
findProject(":orderService:orderDataAccess")?.name = "orderDataAccess"
include("orderService:orderMessaging")
findProject(":orderService:orderMessaging")?.name = "orderMessaging"
include("orderService:orderContainer")
findProject(":orderService:orderContainer")?.name = "orderContainer"
include("orderService:orderDomain:orderDomainCore")
findProject(":orderService:orderDomain:orderDomainCore")?.name = "orderDomainCore"
include("orderService:orderDomain:orderApplicationService")
findProject(":orderService:orderDomain:orderApplicationService")?.name = "orderApplicationService"
