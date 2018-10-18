package ws;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "SessionEJB", mappedName = "WS-WS-SessionEJB")
@TransactionManagement(TransactionManagementType.BEAN)
public class SessionEJBBean implements SessionEJB, SessionEJBLocal {
    @Resource
    SessionContext sessionContext;

    public SessionEJBBean() {
    }
}
