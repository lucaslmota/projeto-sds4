import Dashboarde from "pages/Dashboarde/Index";
import Home from "pages/Home/Index";
import { BrowserRouter, Switch, Route } from "react-router-dom";
const Routes = () => {
    return (
        <BrowserRouter>
            <Switch>

                <Route path="/" exact>
                    <Home />
                </Route>

                <Route path="/dashboarde">
                    <Dashboarde/>
                </Route>

            </Switch>
        </BrowserRouter>
    );
}

export default Routes;