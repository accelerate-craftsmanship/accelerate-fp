const roles: string[] = ["admin", "user"];

function authorize(role: string) {
    return (req, res, next) => {
        // TODO Implement the middleware function
        // Check if the user making the request has the specified role
        // If authorized, call next() to allow the request to continue
        // If not authorized, send a 403 Forbidden response
    };
}

// ---

interface HttpRequest {
    authentication: { username: string, roles: string[] }
}

interface HttpResponse {
    status(code: number): HttpResponse

    send(body: string): void
}

interface App {
    get(
        path: string,
        authorizer: (req: HttpRequest, res: HttpResponse, next: () => void) => void,
        handler: (req: HttpRequest, res: HttpResponse) => void
    ): void
}

const app: App = {};

// Sample route accessible only to admin users
app.get("/admin-dashboard", authorize("admin"), (req, res) => {
    res.send("Admin Dashboard");
});

// Sample route accessible to all users
app.get("/user-profile", authorize("user"), (req, res) => {
    res.send("User Profile");
});
