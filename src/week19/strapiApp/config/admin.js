module.exports = ({ env }) => ({
  auth: {
    secret: env('ADMIN_JWT_SECRET', '0e4e15139de3d128b596ddfb4bd5d0db'),
  },
});
